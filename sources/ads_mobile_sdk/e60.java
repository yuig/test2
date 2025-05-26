package ads_mobile_sdk;

import android.app.Activity;
import java.io.Closeable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class e60 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f4727a;

    /* renamed from: b, reason: collision with root package name */
    public Closeable f4728b;

    /* renamed from: c, reason: collision with root package name */
    public Closeable f4729c;

    /* renamed from: d, reason: collision with root package name */
    public Activity f4730d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f4731e;

    /* renamed from: f, reason: collision with root package name */
    public int f4732f;

    /* renamed from: g, reason: collision with root package name */
    public int f4733g;

    /* renamed from: h, reason: collision with root package name */
    public int f4734h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f4735i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t60 f4736j;

    /* renamed from: k, reason: collision with root package name */
    public int f4737k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e60(t60 t60Var, bl2.c cVar) {
        super(cVar);
        this.f4736j = t60Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f4735i = obj;
        this.f4737k |= Integer.MIN_VALUE;
        return this.f4736j.e(this);
    }
}
