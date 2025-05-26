package net.quikkly.core;

import ap2.a;
import ap2.e;
import bp2.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes4.dex */
public class StrUtils {
    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean isTrimEmpty(String str) {
        return isEmpty(str) || str.trim().isEmpty();
    }

    public static String join(List<String> list, String str) {
        if (list == null) {
            return "null";
        }
        if (str == null) {
            str = "";
        }
        StringBuilder sb3 = new StringBuilder();
        boolean z13 = true;
        for (String str2 : list) {
            if (!z13) {
                sb3.append(str);
            }
            sb3.append(str2);
            z13 = false;
        }
        return sb3.toString();
    }

    public static String readUtf8FromFile(File file) {
        return readUtf8FromStream(new FileInputStream(file));
    }

    public static String readUtf8FromStream(InputStream inputStream) {
        int i13 = e.f20331a;
        int i14 = a.f20326a;
        Charset forName = Charset.forName("UTF-8");
        b bVar = new b();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, a.a(forName));
        char[] cArr = new char[4096];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (-1 == read) {
                return bVar.f23674a.toString();
            }
            bVar.write(cArr, 0, read);
        }
    }
}
