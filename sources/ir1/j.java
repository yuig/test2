package ir1;

import android.os.Bundle;
import java.util.ArrayList;
import kk2.m;
import kotlin.collections.CollectionsKt;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;
import u5.b0;
import u5.y;
import uj2.q;

/* loaded from: classes2.dex */
public final class j extends e {

    /* renamed from: m, reason: collision with root package name */
    public final String f73528m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(mr1.c activityProvider, q resultsFeed, String logValue) {
        super(activityProvider, resultsFeed);
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(resultsFeed, "resultsFeed");
        Intrinsics.checkNotNullParameter(logValue, "logValue");
        this.f73528m = logValue;
    }

    public static final y j(j jVar, boolean z13) {
        jVar.getClass();
        ArrayList arrayList = new ArrayList();
        s0 allowUserIds = s0.f80394a;
        Intrinsics.checkNotNullParameter(allowUserIds, "allowedUserIds");
        Intrinsics.checkNotNullParameter(allowUserIds, "allowedProviders");
        Intrinsics.checkNotNullParameter(allowUserIds, "allowUserIds");
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS", new ArrayList<>(allowUserIds));
        Intrinsics.checkNotNullParameter(allowUserIds, "allowUserIds");
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS", new ArrayList<>(allowUserIds));
        b0 credentialOption = new b0("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle, bundle2, false, false, allowUserIds, 1000);
        Intrinsics.checkNotNullParameter(credentialOption, "credentialOption");
        arrayList.add(credentialOption);
        String serverClientId = jVar.f73520l;
        Intrinsics.checkNotNullParameter(serverClientId, "serverClientId");
        if (serverClientId.length() <= 0) {
            throw new IllegalArgumentException("serverClientId should not be empty");
        }
        ej.a credentialOption2 = new ej.a(serverClientId, z13, false);
        Intrinsics.checkNotNullParameter(credentialOption2, "credentialOption");
        arrayList.add(credentialOption2);
        return new y(CollectionsKt.F0(arrayList), null, false, null, false);
    }

    @Override // or1.p
    public final String a() {
        return this.f73528m;
    }

    @Override // lr1.g
    public final m c() {
        m mVar = new m(new m(g(false), new dl1.b0(18, new i(this, 0)), 0), new dl1.b0(19, new i(this, 1)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return mVar;
    }
}
