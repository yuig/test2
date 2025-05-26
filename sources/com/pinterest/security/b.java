package com.pinterest.security;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import kk2.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r42.g f51738i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(r42.g gVar) {
        super(1);
        this.f51738i = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        b20.a requestNonce = (b20.a) obj;
        Intrinsics.checkNotNullParameter(requestNonce, "requestNonce");
        Context applicationContext = this.f51738i.f106191b;
        Intrinsics.checkNotNullParameter(requestNonce, "requestNonce");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        IntegrityManager create = IntegrityManagerFactory.create(applicationContext);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        Task<IntegrityTokenResponse> requestIntegrityToken = create.requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(requestNonce.f21275a).setCloudProjectNumber(694505692171L).build());
        Intrinsics.checkNotNullExpressionValue(requestIntegrityToken, "requestIntegrityToken(...)");
        a throwableWrapper = a.f51737i;
        Intrinsics.checkNotNullParameter(requestIntegrityToken, "<this>");
        Intrinsics.checkNotNullParameter(throwableWrapper, "throwableWrapper");
        kk2.b bVar = new kk2.b(new uv0.a(17, requestIntegrityToken, throwableWrapper), 0);
        Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
        m k13 = bVar.k(new b22.f(13, r42.f.f106189i));
        Intrinsics.checkNotNullExpressionValue(k13, "map(...)");
        return k13;
    }
}
