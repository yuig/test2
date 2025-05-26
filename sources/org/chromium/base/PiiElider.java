package org.chromium.base;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.base.annotations.CalledByNative;
import so.a;

/* loaded from: classes4.dex */
public class PiiElider {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f97309a = Pattern.compile("(\\b|^)(((((http|https|Http|Https|rtsp|Rtsp)://(([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,64}(:([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,25})?@)?)?(([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef-]{0,61}[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]){0,1}\\.)+[a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef]{2,63}|((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9])))(:\\d{1,5})?)|([a-zA-Z][a-zA-Z0-9+.-]+://((([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef;/?:@&=#~.+!*'(),_-])|(%[a-fA-F0-9]{2}))+))))(/(([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef;/?:@&=#~.+!*'(),_-])|(%[a-fA-F0-9]{2}))*)?(\\b|$)");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f97310b = Pattern.compile("\\sat\\s(org\\.chromium|com\\.google|java|android|com\\.android)\\.[^ ]+.|\\(chromium-[^\\.]+\\.aab[^:]+:\\d+\\)|Caused by: java\\.lang\\.(ClassNotFoundException|NoClassDefFoundError):");

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f97311c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f97312d;

    static {
        Pattern.compile("([0-9a-fA-F]{2}[-:]+){5}[0-9a-fA-F]{2}");
        Pattern.compile("\\[\\w*:CONSOLE.*\\].*");
        f97311c = new String[]{"org.chromium.", "com.google.", "com.chrome."};
        f97312d = new String[]{"android.", "com.android.", "dalvik.", "java.", "javax.", "org.apache.", "org.json.", "org.w3c.dom.", "org.xml.", "org.xmlpull.", "System."};
    }

    public static String a(String str) {
        if (f97310b.matcher(str).find()) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder(str);
        Pattern pattern = f97309a;
        Matcher matcher = pattern.matcher(sb3);
        int i13 = 0;
        while (matcher.find(i13)) {
            int start = matcher.start();
            int end = matcher.end();
            String substring = sb3.substring(start, end);
            String[] strArr = f97311c;
            int length = strArr.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    String[] strArr2 = f97312d;
                    int length2 = strArr2.length;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= length2) {
                            try {
                                Class.forName(substring, false, a.f113317a.getClassLoader());
                                break;
                            } catch (Throwable unused) {
                                int lastIndexOf = substring.lastIndexOf(".");
                                if (lastIndexOf != -1) {
                                    try {
                                        Class.forName(substring.substring(0, lastIndexOf), false, a.f113317a.getClassLoader());
                                    } catch (Throwable unused2) {
                                        sb3.replace(start, end, "HTTP://WEBADDRESS.ELIDED");
                                        i13 = start + 24;
                                        matcher = pattern.matcher(sb3);
                                    }
                                }
                                sb3.replace(start, end, "HTTP://WEBADDRESS.ELIDED");
                                i13 = start + 24;
                                matcher = pattern.matcher(sb3);
                            }
                        } else {
                            if (substring.startsWith(strArr2[i15])) {
                                break;
                            }
                            i15++;
                        }
                    }
                } else {
                    if (substring.startsWith(strArr[i14])) {
                        break;
                    }
                    i14++;
                }
            }
            i13 = end;
        }
        return sb3.toString();
    }

    @CalledByNative
    public static String getSanitizedStacktrace(Throwable th3) {
        String stackTraceString = Log.getStackTraceString(th3);
        if (TextUtils.isEmpty(stackTraceString)) {
            return "";
        }
        String[] split = stackTraceString.split("\\n");
        split[0] = a(split[0]);
        for (int i13 = 1; i13 < split.length; i13++) {
            if (split[i13].startsWith("Caused by:")) {
                split[i13] = a(split[i13]);
            }
        }
        return TextUtils.join("\n", split);
    }
}
