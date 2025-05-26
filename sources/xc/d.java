package xc;

import java.util.ArrayList;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import wc.m;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public m f134546a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f134547b;

    public d(m record) {
        Intrinsics.checkNotNullParameter(record, "record");
        this.f134546a = record;
        this.f134547b = f0.l(record);
    }

    public final m a() {
        return this.f134546a;
    }
}
