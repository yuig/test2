package ads_mobile_sdk;

import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;

/* loaded from: classes2.dex */
public final class tu extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public vu f11690a;

    /* renamed from: b, reason: collision with root package name */
    public CronetProvider f11691b;

    /* renamed from: c, reason: collision with root package name */
    public ao2.v f11692c;

    /* renamed from: d, reason: collision with root package name */
    public CronetEngine.Builder f11693d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f11694e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vu f11695f;

    /* renamed from: g, reason: collision with root package name */
    public int f11696g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu(vu vuVar, bl2.c cVar) {
        super(cVar);
        this.f11695f = vuVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f11694e = obj;
        this.f11696g |= Integer.MIN_VALUE;
        return vu.a(this.f11695f, null, null, this);
    }
}
