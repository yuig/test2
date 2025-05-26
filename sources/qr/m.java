package qr;

import kotlin.jvm.internal.Intrinsics;
import rr.c0;
import so.l4;
import so.p4;
import so.s4;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final l4 f104955a;

    /* renamed from: b, reason: collision with root package name */
    public final p4 f104956b;

    /* renamed from: c, reason: collision with root package name */
    public final s4 f104957c;

    /* renamed from: d, reason: collision with root package name */
    public sr.i f104958d;

    /* renamed from: e, reason: collision with root package name */
    public sr.j f104959e;

    public m(l4 todayWebhookDeeplinkUtilFactory, p4 userWebhookDeeplinkUtilFactory, s4 webhookDeeplinkUtilFactory) {
        Intrinsics.checkNotNullParameter(todayWebhookDeeplinkUtilFactory, "todayWebhookDeeplinkUtilFactory");
        Intrinsics.checkNotNullParameter(userWebhookDeeplinkUtilFactory, "userWebhookDeeplinkUtilFactory");
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtilFactory, "webhookDeeplinkUtilFactory");
        this.f104955a = todayWebhookDeeplinkUtilFactory;
        this.f104956b = userWebhookDeeplinkUtilFactory;
        this.f104957c = webhookDeeplinkUtilFactory;
    }

    public final synchronized h a(us1.a activity, c0 deeplinkInitializer) {
        s4 s4Var;
        sr.i iVar;
        sr.j jVar;
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(deeplinkInitializer, "deeplinkInitializer");
            if (this.f104958d == null) {
                this.f104958d = this.f104955a.a(activity);
            }
            if (this.f104959e == null) {
                this.f104959e = this.f104956b.a(activity);
            }
            s4Var = this.f104957c;
            iVar = this.f104958d;
            Intrinsics.f(iVar);
            jVar = this.f104959e;
            Intrinsics.f(jVar);
        } catch (Throwable th3) {
            throw th3;
        }
        return s4Var.a(activity, deeplinkInitializer, iVar, jVar);
    }
}
