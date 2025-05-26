package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class b extends j {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f31288c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i13) {
        super(str);
        this.f31288c = i13;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final n a(m.h hVar, List list) {
        switch (this.f31288c) {
            case 0:
                return new g(Double.valueOf(0.0d));
            case 1:
            case 2:
                return this;
            default:
                return n.Fn;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b() {
        super("internal.platform");
        this.f31288c = 3;
        this.f31471b.put("getVersion", new b("getVersion", 0));
    }
}
