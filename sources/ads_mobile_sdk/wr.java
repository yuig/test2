package ads_mobile_sdk;

import android.os.Bundle;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class wr extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f13183a;

    /* renamed from: b, reason: collision with root package name */
    public Closeable f13184b;

    /* renamed from: c, reason: collision with root package name */
    public Object f13185c;

    /* renamed from: d, reason: collision with root package name */
    public mo2.a f13186d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f13187e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zr f13188f;

    /* renamed from: g, reason: collision with root package name */
    public int f13189g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr(zr zrVar, bl2.c cVar) {
        super(cVar);
        this.f13188f = zrVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f13187e = obj;
        this.f13189g |= Integer.MIN_VALUE;
        return this.f13188f.a((Bundle) null, this);
    }
}
