package com.pinterest.security;

import android.app.Application;
import android.content.Context;
import ao2.j0;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaClient;
import com.pinterest.security.RecaptchaException;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f51740r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f51741s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, bl2.c cVar) {
        super(2, cVar);
        this.f51741s = context;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d(this.f51741s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f51740r;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                Recaptcha recaptcha = Recaptcha.INSTANCE;
                Context applicationContext = this.f51741s.getApplicationContext();
                Intrinsics.g(applicationContext, "null cannot be cast to non-null type android.app.Application");
                this.f51740r = 1;
                obj = recaptcha.fetchClient((Application) applicationContext, "6LfgwR8lAAAAAD2GQbJHdgXWyl3W3sbn9n0c49cY", this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
            }
            return (RecaptchaClient) obj;
        } catch (Exception unused) {
            throw new RecaptchaException.ErrorGettingRecaptchaClient(null);
        }
    }
}
