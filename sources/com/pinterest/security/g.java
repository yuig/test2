package com.pinterest.security;

import ao2.j0;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.pinterest.security.RecaptchaException;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nm.u;
import xk2.s;

/* loaded from: classes4.dex */
public final class g extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f51747r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ RecaptchaClient f51748s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ RecaptchaAction f51749t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ox.b f51750u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f51751v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(RecaptchaClient recaptchaClient, RecaptchaAction recaptchaAction, ox.b bVar, String str, bl2.c cVar) {
        super(2, cVar);
        this.f51748s = recaptchaClient;
        this.f51749t = recaptchaAction;
        this.f51750u = bVar;
        this.f51751v = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g(this.f51748s, this.f51749t, this.f51750u, this.f51751v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object mo92executegIAlus;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f51747r;
        RecaptchaAction recaptchaAction = this.f51749t;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f51747r = 1;
            mo92executegIAlus = this.f51748s.mo92executegIAlus(recaptchaAction, this);
            if (mo92executegIAlus == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
            mo92executegIAlus = ((s) obj).f135226a;
        }
        if (s.a(mo92executegIAlus) != null) {
            r42.i.a(this.f51750u, new RecaptchaException.ErrorGettingRecaptchaToken(null), a.a.j("Failed to execute RecaptchaAction ", recaptchaAction.getAction()), this.f51751v);
            throw new RecaptchaException.ErrorGettingRecaptchaToken(null);
        }
        u uVar = new u();
        uVar.u("token", (String) mo92executegIAlus);
        uVar.u("site_key", "6LfgwR8lAAAAAD2GQbJHdgXWyl3W3sbn9n0c49cY");
        String sVar = uVar.toString();
        Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
        return sVar;
    }
}
