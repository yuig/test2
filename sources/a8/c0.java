package a8;

import android.net.Uri;
import android.util.Base64;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final k f1308a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f1309b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x071a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c0(a8.r r38, a8.c r39, android.net.Uri r40) {
        /*
            Method dump skipped, instructions count: 2128
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.c0.<init>(a8.r, a8.c, android.net.Uri):void");
    }

    public static byte[] a(String str) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length + 4];
        System.arraycopy(e7.q.f57591a, 0, bArr, 0, 4);
        System.arraycopy(decode, 0, bArr, 4, decode.length);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c0.class != obj.getClass()) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f1308a.equals(c0Var.f1308a) && this.f1309b.equals(c0Var.f1309b);
    }

    public final int hashCode() {
        return this.f1309b.hashCode() + ((this.f1308a.hashCode() + RecyclerViewTypes.VIEW_TYPE_CONTACTS_HEADER) * 31);
    }
}
