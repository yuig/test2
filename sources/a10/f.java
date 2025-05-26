package a10;

import android.net.Uri;
import com.pinterest.api.model.f30;
import java.util.LinkedHashMap;
import kotlin.collections.d1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.j;
import kp.n;
import x40.mh;
import x40.pg;
import x40.rg;

/* loaded from: classes3.dex */
public abstract class f implements uf0.b {

    /* renamed from: a, reason: collision with root package name */
    public final n f255a;

    /* renamed from: b, reason: collision with root package name */
    public final n f256b;

    public f(n imageMediumConverter, n imageLargeConverter) {
        Intrinsics.checkNotNullParameter(imageMediumConverter, "imageMediumConverter");
        Intrinsics.checkNotNullParameter(imageLargeConverter, "imageLargeConverter");
        this.f255a = imageMediumConverter;
        this.f256b = imageLargeConverter;
    }

    public static String a(String str) {
        j b13;
        Regex regex = new Regex("\\/(\\d+)x/");
        if (str == null) {
            str = "";
        }
        String path = Uri.parse(str).getPath();
        if (path == null || (b13 = regex.b(0, path)) == null) {
            return null;
        }
        return (String) ((d1) b13.b()).get(1);
    }

    @Override // uf0.b
    public final Object O(Object obj) {
        String a13;
        String a14;
        mh input = (mh) obj;
        Intrinsics.checkNotNullParameter(input, "input");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        pg pgVar = input.f132852w;
        if (pgVar != null && (a14 = a(pgVar.f133049f)) != null) {
            String concat = a14.concat("x");
            this.f256b.getClass();
            linkedHashMap.put(concat, n.N(pgVar));
        }
        rg rgVar = input.f132851v;
        if (rgVar != null && (a13 = a(rgVar.f133215f)) != null) {
            String concat2 = a13.concat("x");
            this.f255a.getClass();
            linkedHashMap.put(concat2, n.O(rgVar));
        }
        return linkedHashMap;
    }

    @Override // uf0.b
    public final Object k(Object obj) {
        f30 input = (f30) obj;
        Intrinsics.checkNotNullParameter(input, "input");
        return null;
    }
}
