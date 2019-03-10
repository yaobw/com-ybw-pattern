package com.pattern.singleton.threadlocal;

/**
 * @author yaobw
 * @date 2019/3/10 2:22 PM
 * @since V1.0
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> singletonThreadLocal=
            new ThreadLocal<ThreadLocalSingleton>(){
                /**
                 * Returns the current thread's "initial value" for this
                 * thread-local variable.  This method will be invoked the first
                 * time a thread accesses the variable with the {@link #get}
                 * method, unless the thread previously invoked the {@link #set}
                 * method, in which case the {@code initialValue} method will not
                 * be invoked for the thread.  Normally, this method is invoked at
                 * most once per thread, but it may be invoked again in case of
                 * subsequent invocations of {@link #remove} followed by {@link #get}.
                 *
                 * <p>This implementation simply returns {@code null}; if the
                 * programmer desires thread-local variables to have an initial
                 * value other than {@code null}, {@code ThreadLocal} must be
                 * subclassed, and this method overridden.  Typically, an
                 * anonymous inner class will be used.
                 *
                 * @return the initial value for this thread-local
                 */
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance(){
        return singletonThreadLocal.get();
    }
}
