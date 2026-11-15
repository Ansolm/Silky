package com.ansolm.fetcher;

/**
 * @author : ansolm
 * @mail : ansolm@outlook.com
 * @project : https://github.com/ansolm/Fetcher
 */
public interface Transformer<S, T> {
    T transform(S source);

    interface Factory<S, T> {
        Transformer<S, T> create();
    }
}
