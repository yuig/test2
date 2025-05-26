package h6;

import android.os.Bundle;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;

/* loaded from: classes.dex */
public final class g extends h1.b {

    /* renamed from: c, reason: collision with root package name */
    public volatile e3.a f67713c;

    /* renamed from: d, reason: collision with root package name */
    public volatile com.google.firebase.messaging.q f67714d;

    public final int E(int i13, CharSequence charSequence) {
        e3.a aVar = this.f67713c;
        aVar.getClass();
        if (i13 < 0 || i13 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            x[] xVarArr = (x[]) spanned.getSpans(i13, i13 + 1, x.class);
            if (xVarArr.length > 0) {
                return spanned.getSpanEnd(xVarArr[0]);
            }
        }
        return ((v) aVar.m(charSequence, Math.max(0, i13 - 16), Math.min(charSequence.length(), i13 + 16), Integer.MAX_VALUE, true, new v(i13))).f67752c;
    }

    public final int F(int i13, CharSequence charSequence) {
        e3.a aVar = this.f67713c;
        aVar.getClass();
        if (i13 < 0 || i13 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            x[] xVarArr = (x[]) spanned.getSpans(i13, i13 + 1, x.class);
            if (xVarArr.length > 0) {
                return spanned.getSpanStart(xVarArr[0]);
            }
        }
        return ((v) aVar.m(charSequence, Math.max(0, i13 - 16), Math.min(charSequence.length(), i13 + 16), Integer.MAX_VALUE, true, new v(i13))).f67751b;
    }

    public final void G() {
        try {
            ((m) this.f66449b).f67734f.a(new f(this));
        } catch (Throwable th3) {
            ((m) this.f66449b).e(th3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058 A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:47:0x0014, B:50:0x0019, B:52:0x001d, B:54:0x002a, B:8:0x0048, B:10:0x0052, B:12:0x0055, B:14:0x0058, B:16:0x0068, B:18:0x006b, B:23:0x0079, B:26:0x0080, B:28:0x0097, B:6:0x003e), top: B:46:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #0 {all -> 0x0039, blocks: (B:47:0x0014, B:50:0x0019, B:52:0x001d, B:54:0x002a, B:8:0x0048, B:10:0x0052, B:12:0x0055, B:14:0x0058, B:16:0x0068, B:18:0x006b, B:23:0x0079, B:26:0x0080, B:28:0x0097, B:6:0x003e), top: B:46:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence H(java.lang.CharSequence r10, int r11, int r12, boolean r13) {
        /*
            r9 = this;
            e3.a r0 = r9.f67713c
            r0.getClass()
            boolean r7 = r10 instanceof h6.f0
            if (r7 == 0) goto Lf
            r1 = r10
            h6.f0 r1 = (h6.f0) r1
            r1.a()
        Lf:
            r1 = 0
            java.lang.Class<h6.x> r2 = h6.x.class
            if (r7 != 0) goto L3e
            boolean r3 = r10 instanceof android.text.Spannable     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L19
            goto L3e
        L19:
            boolean r3 = r10 instanceof android.text.Spanned     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L3c
            r3 = r10
            android.text.Spanned r3 = (android.text.Spanned) r3     // Catch: java.lang.Throwable -> L39
            int r4 = r11 + (-1)
            int r5 = r12 + 1
            int r3 = r3.nextSpanTransition(r4, r5, r2)     // Catch: java.lang.Throwable -> L39
            if (r3 > r12) goto L3c
            h6.j0 r3 = new h6.j0     // Catch: java.lang.Throwable -> L39
            r3.<init>()     // Catch: java.lang.Throwable -> L39
            r3.f67723a = r1     // Catch: java.lang.Throwable -> L39
            android.text.SpannableString r4 = new android.text.SpannableString     // Catch: java.lang.Throwable -> L39
            r4.<init>(r10)     // Catch: java.lang.Throwable -> L39
            r3.f67724b = r4     // Catch: java.lang.Throwable -> L39
            goto L46
        L39:
            r11 = move-exception
            goto Laf
        L3c:
            r3 = 0
            goto L46
        L3e:
            h6.j0 r3 = new h6.j0     // Catch: java.lang.Throwable -> L39
            r4 = r10
            android.text.Spannable r4 = (android.text.Spannable) r4     // Catch: java.lang.Throwable -> L39
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L39
        L46:
            if (r3 == 0) goto L76
            android.text.Spannable r4 = r3.f67724b     // Catch: java.lang.Throwable -> L39
            java.lang.Object[] r2 = r4.getSpans(r11, r12, r2)     // Catch: java.lang.Throwable -> L39
            h6.x[] r2 = (h6.x[]) r2     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L76
            int r4 = r2.length     // Catch: java.lang.Throwable -> L39
            if (r4 <= 0) goto L76
            int r4 = r2.length     // Catch: java.lang.Throwable -> L39
        L56:
            if (r1 >= r4) goto L76
            r5 = r2[r1]     // Catch: java.lang.Throwable -> L39
            android.text.Spannable r6 = r3.f67724b     // Catch: java.lang.Throwable -> L39
            int r6 = r6.getSpanStart(r5)     // Catch: java.lang.Throwable -> L39
            android.text.Spannable r8 = r3.f67724b     // Catch: java.lang.Throwable -> L39
            int r8 = r8.getSpanEnd(r5)     // Catch: java.lang.Throwable -> L39
            if (r6 == r12) goto L6b
            r3.removeSpan(r5)     // Catch: java.lang.Throwable -> L39
        L6b:
            int r11 = java.lang.Math.min(r6, r11)     // Catch: java.lang.Throwable -> L39
            int r12 = java.lang.Math.max(r8, r12)     // Catch: java.lang.Throwable -> L39
            int r1 = r1 + 1
            goto L56
        L76:
            r2 = r11
            if (r2 == r12) goto Lab
            int r11 = r10.length()     // Catch: java.lang.Throwable -> L39
            if (r2 < r11) goto L80
            goto Lab
        L80:
            h6.t r6 = new h6.t     // Catch: java.lang.Throwable -> L39
            java.lang.Object r11 = r0.f56996b     // Catch: java.lang.Throwable -> L39
            e3.e r11 = (e3.e) r11     // Catch: java.lang.Throwable -> L39
            r6.<init>(r3, r11)     // Catch: java.lang.Throwable -> L39
            r4 = 2147483647(0x7fffffff, float:NaN)
            r1 = r10
            r3 = r12
            r5 = r13
            java.lang.Object r11 = r0.m(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L39
            h6.j0 r11 = (h6.j0) r11     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto La2
            android.text.Spannable r11 = r11.f67724b     // Catch: java.lang.Throwable -> L39
            if (r7 == 0) goto La0
            h6.f0 r10 = (h6.f0) r10
            r10.b()
        La0:
            r10 = r11
            goto Lae
        La2:
            if (r7 == 0) goto Lae
        La4:
            r11 = r10
            h6.f0 r11 = (h6.f0) r11
            r11.b()
            goto Lae
        Lab:
            if (r7 == 0) goto Lae
            goto La4
        Lae:
            return r10
        Laf:
            if (r7 == 0) goto Lb6
            h6.f0 r10 = (h6.f0) r10
            r10.b()
        Lb6:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: h6.g.H(java.lang.CharSequence, int, int, boolean):java.lang.CharSequence");
    }

    public final void I(EditorInfo editorInfo) {
        Bundle bundle = editorInfo.extras;
        i6.b bVar = (i6.b) this.f67714d.f33803a;
        int a13 = bVar.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a13 != 0 ? bVar.f71621b.getInt(a13 + bVar.f71620a) : 0);
        Bundle bundle2 = editorInfo.extras;
        ((m) this.f66449b).getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
