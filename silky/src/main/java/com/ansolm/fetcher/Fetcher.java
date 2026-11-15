package com.ansolm.fetcher;

/**
 * @author : ansolm
 * @mail : ansolm@outlook.com
 * @project : https://github.com/ansolm/Fetcher
 */
public interface Fetcher<S, T> {
    T fetch(S source);

    interface Factory<S, T> {
        Fetcher<S, T> create();
    }
}
