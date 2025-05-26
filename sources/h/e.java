package h;

import a8.q;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.o;
import g.j;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e extends a {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (r1 >= 2) goto L9;
     */
    @Override // h.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.Intent a(androidx.activity.o r7, java.lang.Object r8) {
        /*
            r6 = this;
            g.j r8 = (g.j) r8
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r1 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L13
            goto L1e
        L13:
            r2 = 30
            if (r1 < r2) goto L30
            int r1 = com.bugsnag.android.f.b()
            r2 = 2
            if (r1 < r2) goto L30
        L1e:
            android.content.Intent r7 = new android.content.Intent
            java.lang.String r0 = "android.provider.action.PICK_IMAGES"
            r7.<init>(r0)
            h.d r8 = r8.f63182a
            java.lang.String r8 = kp.n.p0(r8)
            r7.setType(r8)
            goto Lf9
        L30:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            android.content.pm.PackageManager r1 = r7.getPackageManager()
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.activity.result.contract.action.PICK_IMAGES"
            r2.<init>(r3)
            r4 = 1114112(0x110000, float:1.561203E-39)
            android.content.pm.ResolveInfo r1 = r1.resolveActivity(r2, r4)
            java.lang.String r2 = "Required value was null."
            if (r1 == 0) goto L83
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r3)
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r0, r4)
            if (r7 == 0) goto L79
            android.content.pm.ActivityInfo r7 = r7.activityInfo
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r3)
            android.content.pm.ApplicationInfo r1 = r7.applicationInfo
            java.lang.String r1 = r1.packageName
            java.lang.String r7 = r7.name
            r0.setClassName(r1, r7)
            h.d r7 = r8.f63182a
            java.lang.String r7 = kp.n.p0(r7)
            r0.setType(r7)
        L76:
            r7 = r0
            goto Lf9
        L79:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = r2.toString()
            r7.<init>(r8)
            throw r7
        L83:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            android.content.pm.PackageManager r1 = r7.getPackageManager()
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r5 = "com.google.android.gms.provider.action.PICK_IMAGES"
            r3.<init>(r5)
            android.content.pm.ResolveInfo r1 = r1.resolveActivity(r3, r4)
            if (r1 == 0) goto Ld0
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r5)
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r0, r4)
            if (r7 == 0) goto Lc6
            android.content.pm.ActivityInfo r7 = r7.activityInfo
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r5)
            android.content.pm.ApplicationInfo r1 = r7.applicationInfo
            java.lang.String r1 = r1.packageName
            java.lang.String r7 = r7.name
            r0.setClassName(r1, r7)
            h.d r7 = r8.f63182a
            java.lang.String r7 = kp.n.p0(r7)
            r0.setType(r7)
            goto L76
        Lc6:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = r2.toString()
            r7.<init>(r8)
            throw r7
        Ld0:
            android.content.Intent r7 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.OPEN_DOCUMENT"
            r7.<init>(r0)
            h.d r8 = r8.f63182a
            java.lang.String r8 = kp.n.p0(r8)
            r7.setType(r8)
            java.lang.String r8 = r7.getType()
            if (r8 != 0) goto Lf9
        */
        //  java.lang.String r8 = "*/*"
        /*
            r7.setType(r8)
            java.lang.String r8 = "image/*"
            java.lang.String r0 = "video/*"
            java.lang.String[] r8 = new java.lang.String[]{r8, r0}
            java.lang.String r0 = "android.intent.extra.MIME_TYPES"
            r7.putExtra(r0, r8)
        Lf9:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h.e.a(androidx.activity.o, java.lang.Object):android.content.Intent");
    }

    @Override // h.a
    public final q b(o context, Object obj) {
        j input = (j) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return null;
    }

    @Override // h.a
    public final Object c(Intent intent, int i13) {
        List arrayList;
        if (i13 != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        if (data != null) {
            return data;
        }
        Intrinsics.checkNotNullParameter(intent, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Uri data2 = intent.getData();
        if (data2 != null) {
            linkedHashSet.add(data2);
        }
        ClipData clipData = intent.getClipData();
        if (clipData == null && linkedHashSet.isEmpty()) {
            arrayList = q0.f80391a;
        } else {
            if (clipData != null) {
                int itemCount = clipData.getItemCount();
                for (int i14 = 0; i14 < itemCount; i14++) {
                    Uri uri = clipData.getItemAt(i14).getUri();
                    if (uri != null) {
                        linkedHashSet.add(uri);
                    }
                }
            }
            arrayList = new ArrayList(linkedHashSet);
        }
        return (Uri) CollectionsKt.firstOrNull(arrayList);
    }
}
