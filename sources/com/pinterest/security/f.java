package com.pinterest.security;

import com.pinterest.security.RecaptchaException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ox.b f51744i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f51745j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f51746k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ox.b bVar, String str, String str2) {
        super(1);
        this.f51744i = bVar;
        this.f51745j = str;
        this.f51746k = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th3 = (Throwable) obj;
        r42.i.a(this.f51744i, th3, "Failed to execute RecaptchaAction " + this.f51745j, this.f51746k);
        return new RecaptchaException.ErrorGettingRecaptchaToken(th3);
    }
}
