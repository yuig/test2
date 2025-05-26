package com.pinterest.account;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.net.Uri;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/pinterest/account/CredentialsContentProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "kp/n", "hairball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CredentialsContentProvider extends ContentProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final List f34798a = f0.j("tv.pinterest.studio", "com.pinterest.shuffles");

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.database.Cursor query(android.net.Uri r3, java.lang.String[] r4, java.lang.String r5, java.lang.String[] r6, java.lang.String r7) {
        /*
            r2 = this;
            java.lang.String r4 = "uri"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            android.database.MatrixCursor r3 = new android.database.MatrixCursor
            java.lang.String r4 = "accessToken"
            java.lang.String r5 = "id"
            java.lang.String r6 = "username"
            java.lang.String r7 = "name"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7}
            r3.<init>(r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r4 >= r5) goto L2b
            java.lang.String r4 = r2.getCallingPackage()
            if (r4 == 0) goto L2a
            java.util.List r5 = com.pinterest.account.CredentialsContentProvider.f34798a
            boolean r4 = r5.contains(r4)
            if (r4 != 0) goto L2b
        L2a:
            return r3
        L2b:
            android.content.Context r4 = r2.getContext()
            if (r4 == 0) goto Lda
            a60.a r5 = a60.a.f905a
            java.lang.String r6 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r6)
            java.lang.String r5 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            android.content.SharedPreferences r5 = a60.a.a(r4)
            java.util.Map r5 = r5.getAll()
            java.lang.String r6 = "getAll(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ 1
            if (r5 != 0) goto L55
            kotlin.collections.q0 r4 = kotlin.collections.q0.f80391a
            goto Lbd
        L55:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            android.content.SharedPreferences r4 = a60.a.a(r4)
            java.util.Map r4 = r4.getAll()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L6d:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto Lb9
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getValue()
            if (r6 == 0) goto L6d
            java.lang.String r6 = r6.toString()
            nm.s r6 = df.j1.p1(r6)
            nm.u r6 = r6.i()
            java.lang.String r7 = "PREF_ACCESSTOKEN"
            nm.s r0 = r6.v(r7)
            r1 = 0
            if (r0 != 0) goto L96
        L94:
            r7 = r1
            goto L9e
        L96:
            nm.s r7 = r6.v(r7)     // Catch: java.lang.Exception -> L94
            java.lang.String r7 = r7.p()     // Catch: java.lang.Exception -> L94
        L9e:
            if (r7 != 0) goto Lb5
            java.lang.String r7 = "PREF_V5_ACCESS_TOKEN"
            nm.s r0 = r6.v(r7)
            if (r0 != 0) goto La9
            goto Lb1
        La9:
            nm.s r6 = r6.v(r7)     // Catch: java.lang.Exception -> Lb1
            java.lang.String r1 = r6.p()     // Catch: java.lang.Exception -> Lb1
        Lb1:
            kotlin.jvm.internal.Intrinsics.f(r1)
            r7 = r1
        Lb5:
            r5.add(r7)
            goto L6d
        Lb9:
            java.util.List r4 = kotlin.collections.CollectionsKt.F0(r5)
        Lbd:
            java.util.Iterator r4 = r4.iterator()
        Lc1:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Ld9
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "NONE"
            java.lang.String r7 = ""
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r6, r7, r7}
            r3.addRow(r5)
            goto Lc1
        Ld9:
            return r3
        Lda:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "No valid context available"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.account.CredentialsContentProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }
}
