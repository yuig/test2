package okhttp3.internal.publicsuffix;

import ao2.m0;
import dl2.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import wo2.s;
import wo2.y;
import yn2.c0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f96245e = new Companion(0);

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f96246f = {42};

    /* renamed from: g, reason: collision with root package name */
    public static final List f96247g = e0.b("*");

    /* renamed from: h, reason: collision with root package name */
    public static final PublicSuffixDatabase f96248h = new PublicSuffixDatabase();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f96249a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f96250b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public byte[] f96251c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f96252d;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;", "", "", "EXCEPTION_MARKER", "C", "", "", "PREVAILING_RULE", "Ljava/util/List;", "PUBLIC_SUFFIX_RESOURCE", "Ljava/lang/String;", "", "WILDCARD_LABEL", "[B", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }

        public static final String a(Companion companion, byte[] bArr, byte[][] bArr2, int i13) {
            int i14;
            boolean z13;
            int i15;
            int i16;
            companion.getClass();
            int length = bArr.length;
            int i17 = 0;
            while (i17 < length) {
                int i18 = (i17 + length) / 2;
                while (i18 > -1 && bArr[i18] != 10) {
                    i18--;
                }
                int i19 = i18 + 1;
                int i23 = 1;
                while (true) {
                    i14 = i19 + i23;
                    if (bArr[i14] == 10) {
                        break;
                    }
                    i23++;
                }
                int i24 = i14 - i19;
                int i25 = i13;
                boolean z14 = false;
                int i26 = 0;
                int i27 = 0;
                while (true) {
                    if (z14) {
                        i15 = 46;
                        z13 = false;
                    } else {
                        byte b13 = bArr2[i25][i26];
                        byte[] bArr3 = Util.f95757a;
                        int i28 = b13 & 255;
                        z13 = z14;
                        i15 = i28;
                    }
                    byte b14 = bArr[i19 + i27];
                    byte[] bArr4 = Util.f95757a;
                    i16 = i15 - (b14 & 255);
                    if (i16 != 0) {
                        break;
                    }
                    i27++;
                    i26++;
                    if (i27 == i24) {
                        break;
                    }
                    if (bArr2[i25].length != i26) {
                        z14 = z13;
                    } else {
                        if (i25 == bArr2.length - 1) {
                            break;
                        }
                        i25++;
                        i26 = -1;
                        z14 = true;
                    }
                }
                if (i16 >= 0) {
                    if (i16 <= 0) {
                        int i29 = i24 - i27;
                        int length2 = bArr2[i25].length - i26;
                        int length3 = bArr2.length;
                        for (int i33 = i25 + 1; i33 < length3; i33++) {
                            length2 += bArr2[i33].length;
                        }
                        if (length2 >= i29) {
                            if (length2 <= i29) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                                return new String(bArr, i19, i24, UTF_8);
                            }
                        }
                    }
                    i17 = i14 + 1;
                }
                length = i18;
            }
            return null;
        }
    }

    public static List c(String str) {
        List V = StringsKt.V(str, new char[]{'.'});
        return Intrinsics.d(CollectionsKt.b0(V), "") ? CollectionsKt.O(V) : V;
    }

    public final String a(String domain) {
        String str;
        String str2;
        String str3;
        List list;
        List list2;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        Intrinsics.checkNotNullExpressionValue(unicodeDomain, "unicodeDomain");
        List c13 = c(unicodeDomain);
        if (this.f96249a.get() || !this.f96249a.compareAndSet(false, true)) {
            try {
                this.f96250b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z13 = false;
            while (true) {
                try {
                    try {
                        try {
                            b();
                            break;
                        } catch (InterruptedIOException unused2) {
                            Thread.interrupted();
                            z13 = true;
                        }
                    } catch (IOException e13) {
                        Platform.f96214a.getClass();
                        Platform.f96215b.getClass();
                        Platform.i(5, "Failed to read public suffix list", e13);
                        if (z13) {
                        }
                    }
                } finally {
                    if (z13) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (this.f96251c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size = c13.size();
        byte[][] bArr = new byte[size][];
        for (int i13 = 0; i13 < size; i13++) {
            String str4 = (String) c13.get(i13);
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = str4.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i13] = bytes;
        }
        int i14 = 0;
        while (true) {
            if (i14 >= size) {
                str = null;
                break;
            }
            Companion companion = f96245e;
            byte[] bArr2 = this.f96251c;
            if (bArr2 == null) {
                Intrinsics.r("publicSuffixListBytes");
                throw null;
            }
            str = Companion.a(companion, bArr2, bArr, i14);
            if (str != null) {
                break;
            }
            i14++;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i15 = 0; i15 < length; i15++) {
                bArr3[i15] = f96246f;
                Companion companion2 = f96245e;
                byte[] bArr4 = this.f96251c;
                if (bArr4 == null) {
                    Intrinsics.r("publicSuffixListBytes");
                    throw null;
                }
                str2 = Companion.a(companion2, bArr4, bArr3, i15);
                if (str2 != null) {
                    break;
                }
            }
        }
        str2 = null;
        if (str2 != null) {
            int i16 = size - 1;
            for (int i17 = 0; i17 < i16; i17++) {
                Companion companion3 = f96245e;
                byte[] bArr5 = this.f96252d;
                if (bArr5 == null) {
                    Intrinsics.r("publicSuffixExceptionListBytes");
                    throw null;
                }
                str3 = Companion.a(companion3, bArr5, bArr, i17);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            list2 = StringsKt.V("!".concat(str3), new char[]{'.'});
        } else if (str == null && str2 == null) {
            list2 = f96247g;
        } else {
            if (str == null || (list = StringsKt.V(str, new char[]{'.'})) == null) {
                list = q0.f80391a;
            }
            if (str2 == null || (list2 = StringsKt.V(str2, new char[]{'.'})) == null) {
                list2 = q0.f80391a;
            }
            if (list.size() > list2.size()) {
                list2 = list;
            }
        }
        if (c13.size() != list2.size() || ((String) list2.get(0)).charAt(0) == '!') {
            return c0.n(c0.i(CollectionsKt.K(c(domain)), ((String) list2.get(0)).charAt(0) == '!' ? c13.size() - list2.size() : c13.size() - (list2.size() + 1)), ".", null, 62);
        }
        return null;
    }

    public final void b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream == null) {
                return;
            }
            y i13 = m0.i(new s(m0.l0(resourceAsStream)));
            try {
                long readInt = i13.readInt();
                i13.N0(readInt);
                byte[] A = i13.f130750b.A(readInt);
                long readInt2 = i13.readInt();
                i13.N0(readInt2);
                byte[] A2 = i13.f130750b.A(readInt2);
                Unit unit = Unit.f80348a;
                b.J(i13, null);
                synchronized (this) {
                    this.f96251c = A;
                    this.f96252d = A2;
                }
            } finally {
            }
        } finally {
            this.f96250b.countDown();
        }
    }
}
