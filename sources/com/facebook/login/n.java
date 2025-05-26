package com.facebook.login;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import kh2.u2;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Set f30025a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30026b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30027c;

    public n(Collection collection) {
        String nonce = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(nonce, "randomUUID().toString()");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        int n13 = ql2.s.n(ol2.f.f96454a, new IntRange(43, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, 1));
        ArrayList m03 = CollectionsKt.m0('~', CollectionsKt.m0('_', CollectionsKt.m0('.', CollectionsKt.m0('-', CollectionsKt.l0(new ql2.e('0', '9'), CollectionsKt.j0(new ql2.e('a', 'z'), new ql2.e('A', 'Z')))))));
        ArrayList arrayList = new ArrayList(n13);
        for (int i13 = 0; i13 < n13; i13++) {
            Character ch3 = (Character) CollectionsKt.o0(m03, ol2.f.f96454a);
            ch3.getClass();
            arrayList.add(ch3);
        }
        String codeVerifier = CollectionsKt.Z(arrayList, "", null, null, 0, null, null, 62);
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
        if (nonce != null && nonce.length() != 0) {
            if ((!(StringsKt.K(nonce, ' ', 0, false, 6) >= 0)) && u2.N0(codeVerifier)) {
                HashSet hashSet = collection != null ? new HashSet(collection) : new HashSet();
                hashSet.add("openid");
                Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
                Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(permissions)");
                this.f30025a = unmodifiableSet;
                this.f30026b = nonce;
                this.f30027c = codeVerifier;
                return;
            }
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final String a() {
        return this.f30027c;
    }

    public final String b() {
        return this.f30026b;
    }

    public final Set c() {
        return this.f30025a;
    }
}
