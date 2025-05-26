package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import c50.c1;
import com.pinterest.api.model.k8;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class z implements sh.b, sh.c, kk.e, com.google.crypto.tink.shaded.protobuf.i0, pm.p {

    /* renamed from: b */
    public static volatile z f30091b;

    /* renamed from: a */
    public final /* synthetic */ int f30092a;

    public /* synthetic */ z(int i13) {
        this.f30092a = i13;
    }

    public static k8 c(List invites) {
        Object obj;
        Intrinsics.checkNotNullParameter(invites, "invites");
        Iterator it = CollectionsKt.x0(invites, new b4.f(7)).iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            boolean z13 = lr.f.f84504g;
            String str = ((k8) next).f39332b;
            lb0.o a13 = lb0.n.f82725d.a();
            Intrinsics.checkNotNullExpressionValue(a13, "user(...)");
            Set h10 = ((lb0.b) a13).h("PREF_BOARD_INVITE_ID_SEEN_LAST_24H_2024_V1", null);
            boolean z14 = false;
            if (h10 != null) {
                Set set = h10;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator it2 = set.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (StringsKt.E((String) it2.next(), str, false)) {
                            z14 = true;
                            break;
                        }
                    }
                }
            }
            if (!z14) {
                obj = next;
                break;
            }
        }
        return (k8) obj;
    }

    public static final Bundle e(String serverClientId, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(serverClientId, "serverClientId");
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_SERVER_CLIENT_ID", serverClientId);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_NONCE", null);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FILTER_BY_AUTHORIZED_ACCOUNTS", z13);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_LINKED_SERVICE_ID", null);
        bundle.putStringArrayList("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN_DEPOSITION_SCOPES", null);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_REQUEST_VERIFIED_PHONE_NUMBER", false);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_AUTO_SELECT_ENABLED", z14);
        return bundle;
    }

    @Override // sh.b
    public final int a(Context context, String str, boolean z13) {
        return sh.d.d(context, str, z13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r6 == 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r6 == 0) goto L43;
     */
    @Override // sh.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final e7.i b(android.content.Context r6, java.lang.String r7, sh.b r8) {
        /*
            r5 = this;
            int r0 = r5.f30092a
            r1 = 0
            r2 = -1
            r3 = 1
            switch(r0) {
                case 3: goto L4a;
                case 4: goto L29;
                default: goto L8;
            }
        L8:
            e7.i r0 = new e7.i
            r0.<init>()
            int r4 = r8.d(r6, r7)
            r0.f57538a = r4
            int r6 = r8.a(r6, r7, r3)
            r0.f57539b = r6
            int r7 = r0.f57538a
            if (r7 != 0) goto L20
            if (r6 != 0) goto L21
            goto L26
        L20:
            r1 = r7
        L21:
            if (r6 < r1) goto L25
            r1 = r3
            goto L26
        L25:
            r1 = r2
        L26:
            r0.f57540c = r1
            return r0
        L29:
            e7.i r0 = new e7.i
            r0.<init>()
            int r4 = r8.d(r6, r7)
            r0.f57538a = r4
            int r6 = r8.a(r6, r7, r3)
            r0.f57539b = r6
            int r7 = r0.f57538a
            if (r7 != 0) goto L41
            if (r6 != 0) goto L42
            goto L47
        L41:
            r1 = r7
        L42:
            if (r1 < r6) goto L46
            r1 = r2
            goto L47
        L46:
            r1 = r3
        L47:
            r0.f57540c = r1
            return r0
        L4a:
            e7.i r0 = new e7.i
            r0.<init>()
            int r1 = r8.d(r6, r7)
            r0.f57538a = r1
            if (r1 == 0) goto L5a
            r0.f57540c = r2
            goto L64
        L5a:
            int r6 = r8.a(r6, r7, r3)
            r0.f57539b = r6
            if (r6 == 0) goto L64
            r0.f57540c = r3
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.z.b(android.content.Context, java.lang.String, sh.b):e7.i");
    }

    @Override // sh.b
    public final int d(Context context, String str) {
        return sh.d.a(context, str);
    }

    @Override // kk.e
    public final boolean k(ClassLoader classLoader, File file, File file2, boolean z13) {
        return kp.n.C0(classLoader, file, file2, z13, new c1(0), "path", new c1(9));
    }

    @Override // kk.e
    public final void l(ClassLoader classLoader, HashSet hashSet) {
        c1.p(classLoader, hashSet, new c1(5));
    }

    @Override // pm.p
    public final Object u() {
        return new ArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i13, int i14) {
        this(0);
        this.f30092a = i13;
        switch (i13) {
            case 19:
                this(19);
                break;
            case 20:
                this(20);
                break;
            case 21:
                this(21);
                break;
            case 22:
                this(22);
                break;
            case 23:
                this(23);
                break;
            case 24:
                this(24);
                break;
            case 25:
                this(25);
                break;
            case 26:
                this(26);
                break;
            case 27:
                this(27);
                break;
            case 28:
                this(28);
                break;
            case 29:
                this(29);
                break;
            default:
                break;
        }
    }

    public z() {
        this.f30092a = 16;
    }
}
