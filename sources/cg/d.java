package cg;

import java.io.FilterWriter;
import java.io.Writer;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class d extends FilterWriter {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f27679a;

    public d(Writer writer) {
        super(writer);
        this.f27679a = new AtomicInteger(0);
    }
}
