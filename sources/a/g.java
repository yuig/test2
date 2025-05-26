package a;

import java.security.GeneralSecurityException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import javax.crypto.Cipher;

/* loaded from: classes2.dex */
public final class g extends ThreadLocal {

    /* renamed from: a */
    public final /* synthetic */ int f42a;

    public /* synthetic */ g(int i13) {
        this.f42a = i13;
    }

    public final SimpleDateFormat a() {
        switch (this.f42a) {
            case 1:
                return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
            case 2:
                return new SimpleDateFormat("HH:mm:ss", Locale.US);
            default:
                return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    public final Cipher b() {
        switch (this.f42a) {
            case 8:
                try {
                    return (Cipher) ll.s.f83768b.a("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e13) {
                    throw new IllegalStateException(e13);
                }
            case 9:
                try {
                    Cipher cipher = (Cipher) ll.s.f83768b.a("ChaCha20-Poly1305");
                    if (wk.k.c(cipher)) {
                        return cipher;
                    }
                    return null;
                } catch (GeneralSecurityException unused) {
                    return null;
                }
            case 10:
                try {
                    Cipher cipher2 = (Cipher) ll.s.f83768b.a("AES/GCM-SIV/NoPadding");
                    if (xk.a.c(cipher2)) {
                        return cipher2;
                    }
                    return null;
                } catch (GeneralSecurityException e14) {
                    throw new IllegalStateException(e14);
                }
            case 11:
            default:
                try {
                    return (Cipher) ll.s.f83768b.a("AES/ECB/NoPadding");
                } catch (GeneralSecurityException e15) {
                    throw new IllegalStateException(e15);
                }
            case 12:
                try {
                    return (Cipher) ll.s.f83768b.a("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e16) {
                    throw new IllegalStateException(e16);
                }
            case 13:
                try {
                    return (Cipher) ll.s.f83768b.a("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e17) {
                    throw new IllegalStateException(e17);
                }
            case 14:
                try {
                    return (Cipher) ll.s.f83768b.a("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e18) {
                    throw new IllegalStateException(e18);
                }
            case 15:
                try {
                    return (Cipher) ll.s.f83768b.a("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e19) {
                    throw new IllegalStateException(e19);
                }
        }
    }

    public final SimpleDateFormat c() {
        switch (this.f42a) {
            case 5:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                return simpleDateFormat;
            default:
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
                simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
                return simpleDateFormat2;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:171|(2:172|(2:174|(1:177)(1:176))(2:196|197))|(4:192|193|184|185)|179|180|181|(4:186|187|184|185)|183|184|185) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:125|(4:127|128|129|130)|133|134|135|(4:138|139|129|130)|137|129|130) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x023d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v81 */
    @Override // java.lang.ThreadLocal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object initialValue() {
        /*
            Method dump skipped, instructions count: 966
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.initialValue():java.lang.Object");
    }
}
