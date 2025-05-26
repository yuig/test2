package jf0;

import a.cb;
import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import lh0.v3;
import lh0.z0;
import so.oa;

/* loaded from: classes5.dex */
public final class a extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f75858j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f75859k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f75860l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f75861m = new a(3);

    /* renamed from: n, reason: collision with root package name */
    public static final a f75862n = new a(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f75863i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(0);
        this.f75863i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f75863i) {
            case 0:
                return new b();
            case 1:
                Context context = kb0.a.f79058b;
                return (c) ep.b.g(c.class);
            case 2:
                return new d();
            case 3:
                Context context2 = kb0.a.f79058b;
                return (e) cb.e(e.class);
            default:
                return new v3((z0) ((oa) ((e) ((d) d.f75866b.getValue()).f75867a.getValue())).D0.get());
        }
    }
}
