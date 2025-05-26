package a8;

import a.cb;
import androidx.media3.common.ParserException;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f1284a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1285b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1286c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1287d;

    public b(String str, int i13, int i14, int i15) {
        this.f1284a = i13;
        this.f1285b = str;
        this.f1286c = i14;
        this.f1287d = i15;
    }

    public static b a(String str) {
        int i13 = d7.n0.f53866a;
        String[] split = str.split(" ", 2);
        bf.b.i(split.length == 2);
        String str2 = split[0];
        Pattern pattern = j0.f1371a;
        try {
            int parseInt = Integer.parseInt(str2);
            int i14 = -1;
            String[] split2 = split[1].trim().split("/", -1);
            bf.b.i(split2.length >= 2);
            String str3 = split2[1];
            try {
                int parseInt2 = Integer.parseInt(str3);
                if (split2.length == 3) {
                    String str4 = split2[2];
                    try {
                        i14 = Integer.parseInt(str4);
                    } catch (NumberFormatException e13) {
                        throw ParserException.b(str4, e13);
                    }
                }
                return new b(split2[0], parseInt, parseInt2, i14);
            } catch (NumberFormatException e14) {
                throw ParserException.b(str3, e14);
            }
        } catch (NumberFormatException e15) {
            throw ParserException.b(str2, e15);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1284a == bVar.f1284a && this.f1285b.equals(bVar.f1285b) && this.f1286c == bVar.f1286c && this.f1287d == bVar.f1287d;
    }

    public final int hashCode() {
        return ((cb.d(this.f1285b, (RecyclerViewTypes.VIEW_TYPE_CONTACTS_HEADER + this.f1284a) * 31, 31) + this.f1286c) * 31) + this.f1287d;
    }
}
