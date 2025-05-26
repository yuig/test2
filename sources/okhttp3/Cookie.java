package okhttp3;

import a.a;
import a.cb;
import ep.b;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import okhttp3.internal.http.DatesKt$STANDARD_DATE_FORMAT$1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Cookie;", "", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Cookie {

    /* renamed from: j, reason: collision with root package name */
    public static final Companion f95581j = new Companion(0);

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f95582k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f95583l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f95584m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f95585n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f95586a;

    /* renamed from: b, reason: collision with root package name */
    public final String f95587b;

    /* renamed from: c, reason: collision with root package name */
    public final long f95588c;

    /* renamed from: d, reason: collision with root package name */
    public final String f95589d;

    /* renamed from: e, reason: collision with root package name */
    public final String f95590e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f95591f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f95592g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f95593h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f95594i;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Cookie$Builder;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f95595a;

        /* renamed from: b, reason: collision with root package name */
        public String f95596b;

        /* renamed from: d, reason: collision with root package name */
        public String f95598d;

        /* renamed from: f, reason: collision with root package name */
        public boolean f95600f;

        /* renamed from: c, reason: collision with root package name */
        public final long f95597c = 253402300799999L;

        /* renamed from: e, reason: collision with root package name */
        public final String f95599e = "/";
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u001c\u0010\u0007\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u001c\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005¨\u0006\u000b"}, d2 = {"Lokhttp3/Cookie$Companion;", "", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "DAY_OF_MONTH_PATTERN", "Ljava/util/regex/Pattern;", "MONTH_PATTERN", "TIME_PATTERN", "YEAR_PATTERN", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }

        public static int a(String str, int i13, int i14, boolean z13) {
            while (i13 < i14) {
                char charAt = str.charAt(i13);
                if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z13)) {
                    return i13;
                }
                i13++;
            }
            return i14;
        }

        public static long b(int i13, String str) {
            int a13 = a(str, 0, i13, false);
            Matcher matcher = Cookie.f95585n.matcher(str);
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            while (a13 < i13) {
                int a14 = a(str, a13 + 1, i13, true);
                matcher.region(a13, a14);
                if (i15 == -1 && matcher.usePattern(Cookie.f95585n).matches()) {
                    String group = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(group, "matcher.group(1)");
                    i15 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    Intrinsics.checkNotNullExpressionValue(group2, "matcher.group(2)");
                    i18 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    Intrinsics.checkNotNullExpressionValue(group3, "matcher.group(3)");
                    i19 = Integer.parseInt(group3);
                } else if (i16 == -1 && matcher.usePattern(Cookie.f95584m).matches()) {
                    String group4 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(group4, "matcher.group(1)");
                    i16 = Integer.parseInt(group4);
                } else {
                    if (i17 == -1) {
                        Pattern pattern = Cookie.f95583l;
                        if (matcher.usePattern(pattern).matches()) {
                            String group5 = matcher.group(1);
                            Intrinsics.checkNotNullExpressionValue(group5, "matcher.group(1)");
                            Locale locale = Locale.US;
                            String l13 = b.l(locale, "US", group5, locale, "this as java.lang.String).toLowerCase(locale)");
                            String pattern2 = pattern.pattern();
                            Intrinsics.checkNotNullExpressionValue(pattern2, "MONTH_PATTERN.pattern()");
                            i17 = StringsKt.L(pattern2, l13, 0, false, 6) / 4;
                        }
                    }
                    if (i14 == -1 && matcher.usePattern(Cookie.f95582k).matches()) {
                        String group6 = matcher.group(1);
                        Intrinsics.checkNotNullExpressionValue(group6, "matcher.group(1)");
                        i14 = Integer.parseInt(group6);
                    }
                }
                a13 = a(str, a14 + 1, i13, false);
            }
            if (70 <= i14 && i14 < 100) {
                i14 += 1900;
            }
            if (i14 >= 0 && i14 < 70) {
                i14 += 2000;
            }
            if (i14 < 1601) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i17 == -1) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (1 > i16 || i16 >= 32) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i15 < 0 || i15 >= 24) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i18 < 0 || i18 >= 60) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i19 < 0 || i19 >= 60) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.f95761e);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i14);
            gregorianCalendar.set(2, i17 - 1);
            gregorianCalendar.set(5, i16);
            gregorianCalendar.set(11, i15);
            gregorianCalendar.set(12, i18);
            gregorianCalendar.set(13, i19);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    public Cookie(String str, String str2, long j13, String str3, String str4, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f95586a = str;
        this.f95587b = str2;
        this.f95588c = j13;
        this.f95589d = str3;
        this.f95590e = str4;
        this.f95591f = z13;
        this.f95592g = z14;
        this.f95593h = z15;
        this.f95594i = z16;
    }

    public final String a(boolean z13) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f95586a);
        sb3.append('=');
        sb3.append(this.f95587b);
        if (this.f95593h) {
            long j13 = this.f95588c;
            if (j13 == Long.MIN_VALUE) {
                sb3.append("; max-age=0");
            } else {
                sb3.append("; expires=");
                Date date = new Date(j13);
                DatesKt$STANDARD_DATE_FORMAT$1 datesKt$STANDARD_DATE_FORMAT$1 = DatesKt.f95964a;
                Intrinsics.checkNotNullParameter(date, "<this>");
                String format = DatesKt.f95964a.get().format(date);
                Intrinsics.checkNotNullExpressionValue(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb3.append(format);
            }
        }
        if (!this.f95594i) {
            sb3.append("; domain=");
            if (z13) {
                sb3.append(".");
            }
            sb3.append(this.f95589d);
        }
        sb3.append("; path=");
        sb3.append(this.f95590e);
        if (this.f95591f) {
            sb3.append("; secure");
        }
        if (this.f95592g) {
            sb3.append("; httponly");
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString()");
        return sb4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Cookie) {
            Cookie cookie = (Cookie) obj;
            if (Intrinsics.d(cookie.f95586a, this.f95586a) && Intrinsics.d(cookie.f95587b, this.f95587b) && cookie.f95588c == this.f95588c && Intrinsics.d(cookie.f95589d, this.f95589d) && Intrinsics.d(cookie.f95590e, this.f95590e) && cookie.f95591f == this.f95591f && cookie.f95592g == this.f95592g && cookie.f95593h == this.f95593h && cookie.f95594i == this.f95594i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f95594i) + b.e(this.f95593h, b.e(this.f95592g, b.e(this.f95591f, cb.d(this.f95590e, cb.d(this.f95589d, a.c(this.f95588c, cb.d(this.f95587b, cb.d(this.f95586a, 527, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return a(false);
    }
}
