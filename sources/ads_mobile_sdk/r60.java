package ads_mobile_sdk;

import android.app.Activity;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class r60 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f10507a;

    /* renamed from: b, reason: collision with root package name */
    public Closeable f10508b;

    /* renamed from: c, reason: collision with root package name */
    public Closeable f10509c;

    /* renamed from: d, reason: collision with root package name */
    public Activity f10510d;

    /* renamed from: e, reason: collision with root package name */
    public yp0 f10511e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10512f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f10513g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t60 f10514h;

    /* renamed from: i, reason: collision with root package name */
    public int f10515i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r60(t60 t60Var, bl2.c cVar) {
        super(cVar);
        this.f10514h = t60Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f10513g = obj;
        this.f10515i |= Integer.MIN_VALUE;
        return t60.a(this.f10514h, this);
    }
}
