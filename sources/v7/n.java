package v7;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class n extends o {

    /* renamed from: n, reason: collision with root package name */
    public static final n f124330n = new n("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d, reason: collision with root package name */
    public final List f124331d;

    /* renamed from: e, reason: collision with root package name */
    public final List f124332e;

    /* renamed from: f, reason: collision with root package name */
    public final List f124333f;

    /* renamed from: g, reason: collision with root package name */
    public final List f124334g;

    /* renamed from: h, reason: collision with root package name */
    public final List f124335h;

    /* renamed from: i, reason: collision with root package name */
    public final List f124336i;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.media3.common.b f124337j;

    /* renamed from: k, reason: collision with root package name */
    public final List f124338k;

    /* renamed from: l, reason: collision with root package name */
    public final Map f124339l;

    /* renamed from: m, reason: collision with root package name */
    public final List f124340m;

    public n(String str, List list, List list2, List list3, List list4, List list5, List list6, androidx.media3.common.b bVar, List list7, boolean z13, Map map, List list8) {
        super(str, list, z13);
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < list2.size(); i13++) {
            Uri uri = ((m) list2.get(i13)).f124324a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        b(list6, arrayList);
        this.f124331d = Collections.unmodifiableList(arrayList);
        this.f124332e = Collections.unmodifiableList(list2);
        this.f124333f = Collections.unmodifiableList(list3);
        this.f124334g = Collections.unmodifiableList(list4);
        this.f124335h = Collections.unmodifiableList(list5);
        this.f124336i = Collections.unmodifiableList(list6);
        this.f124337j = bVar;
        this.f124338k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f124339l = Collections.unmodifiableMap(map);
        this.f124340m = Collections.unmodifiableList(list8);
    }

    public static void b(List list, ArrayList arrayList) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            Uri uri = ((l) list.get(i13)).f124321a;
            if (uri != null && !arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(int i13, List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i14 = 0; i14 < list.size(); i14++) {
            Object obj = list.get(i14);
            int i15 = 0;
            while (true) {
                if (i15 < list2.size()) {
                    StreamKey streamKey = (StreamKey) list2.get(i15);
                    if (streamKey.f18748b == i13 && streamKey.f18749c == i14) {
                        arrayList.add(obj);
                        break;
                    }
                    i15++;
                }
            }
        }
        return arrayList;
    }

    @Override // z7.n
    public final Object a(List list) {
        return new n(this.f124341a, this.f124342b, c(0, this.f124332e, list), Collections.emptyList(), c(1, this.f124334g, list), c(2, this.f124335h, list), Collections.emptyList(), this.f124337j, this.f124338k, this.f124343c, this.f124339l, this.f124340m);
    }
}
