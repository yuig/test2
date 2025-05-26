package ads_mobile_sdk;

import android.app.Activity;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class s60 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f10960a;

    /* renamed from: b, reason: collision with root package name */
    public Closeable f10961b;

    /* renamed from: c, reason: collision with root package name */
    public cs2 f10962c;

    /* renamed from: d, reason: collision with root package name */
    public Activity f10963d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f10964e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t60 f10965f;

    /* renamed from: g, reason: collision with root package name */
    public int f10966g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s60(t60 t60Var, bl2.c cVar) {
        super(cVar);
        this.f10965f = t60Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f10964e = obj;
        this.f10966g |= Integer.MIN_VALUE;
        return t60.b(this.f10965f, this);
    }
}
