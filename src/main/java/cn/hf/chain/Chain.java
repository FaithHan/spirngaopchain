package cn.hf.chain;

import java.util.List;

public class Chain {

    List<Handler> handlers;

    int index;

    int size;

    public Chain(List<Handler> handlers) {
        this.handlers = handlers;
        this.size = handlers.size();
    }

    public void proceed() {
        if (index >= handlers.size()) {
            return;
        }
        handlers.get(index++).execute(this);
    }
}
