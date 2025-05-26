package com.pinterest.security;

import com.pinterest.security.RecaptchaException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ox.b f51742i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f51743j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ox.b bVar, String str) {
        super(1);
        this.f51742i = bVar;
        this.f51743j = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th3 = (Throwable) obj;
        r42.i.a(this.f51742i, th3, "Failed to initialize RecaptchaClient", this.f51743j);
        return new RecaptchaException.ErrorGettingRecaptchaHandle(th3);
    }
}
