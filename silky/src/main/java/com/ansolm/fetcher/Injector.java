package com.ansolm.fetcher;

/**
 * @author : ansolm
 * @mail : ansolm@outlook.com
 * @project : https://github.com/ansolm/Fetcher
 */
public interface Injector<S, T> {
    void inject(T target, S source);

    interface Factory<S, T> {
        Injector<S, T> create();
    }
}
