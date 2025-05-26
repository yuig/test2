package com.pinterest.security;

import com.google.android.play.core.integrity.IntegrityServiceException;
import com.pinterest.security.PlayIntegrityException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final a f51737i = new a(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th3 = (Throwable) obj;
        return th3 instanceof IntegrityServiceException ? new PlayIntegrityException.IntegrityServiceException(th3) : new PlayIntegrityException.TokenRetrievalError(th3);
    }
}
