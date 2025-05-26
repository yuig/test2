package ads_mobile_sdk;

import java.io.Closeable;
import java.io.Serializable;
import kotlin.jvm.internal.j0;

/* loaded from: classes2.dex */
public final class v32 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f12324a;

    /* renamed from: b, reason: collision with root package name */
    public Closeable f12325b;

    /* renamed from: c, reason: collision with root package name */
    public Closeable f12326c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f12327d;

    /* renamed from: e, reason: collision with root package name */
    public Object f12328e;

    /* renamed from: f, reason: collision with root package name */
    public Object f12329f;

    /* renamed from: g, reason: collision with root package name */
    public j0 f12330g;

    /* renamed from: h, reason: collision with root package name */
    public Object f12331h;

    /* renamed from: i, reason: collision with root package name */
    public j0 f12332i;

    /* renamed from: j, reason: collision with root package name */
    public j0 f12333j;

    /* renamed from: k, reason: collision with root package name */
    public int f12334k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f12335l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w32 f12336m;

    /* renamed from: n, reason: collision with root package name */
    public int f12337n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v32(w32 w32Var, bl2.c cVar) {
        super(cVar);
        this.f12336m = w32Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f12335l = obj;
        this.f12337n |= Integer.MIN_VALUE;
        return w32.a(this.f12336m, (bl2.c) this);
    }
}
