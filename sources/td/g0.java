package td;

import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class g0 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117390a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f117391b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f117392c;

    public g0(ArrayList arrayList, p5.d dVar) {
        this.f117391b = arrayList;
        this.f117392c = dVar;
    }

    @Override // td.c0
    public final boolean a(Object obj) {
        switch (this.f117390a) {
            case 0:
                Iterator it = ((List) this.f117391b).iterator();
                while (it.hasNext()) {
                    if (((c0) it.next()).a(obj)) {
                        break;
                    }
                }
                break;
            default:
                break;
        }
        return true;
    }

    @Override // td.c0
    public final b0 b(Object obj, int i13, int i14, nd.l lVar) {
        b0 b13;
        Uri uri;
        int i15 = this.f117390a;
        Object obj2 = this.f117391b;
        Object obj3 = this.f117392c;
        switch (i15) {
            case 0:
                List list = (List) obj2;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                nd.h hVar = null;
                for (int i16 = 0; i16 < size; i16++) {
                    c0 c0Var = (c0) list.get(i16);
                    if (c0Var.a(obj) && (b13 = c0Var.b(obj, i13, i14, lVar)) != null) {
                        arrayList.add(b13.f117374c);
                        hVar = b13.f117372a;
                    }
                }
                if (arrayList.isEmpty() || hVar == null) {
                    return null;
                }
                return new b0(hVar, new f0(arrayList, (p5.d) obj3));
            default:
                Integer num = (Integer) obj;
                try {
                    uri = Uri.parse("android.resource://" + ((Resources) obj3).getResourcePackageName(num.intValue()) + '/' + ((Resources) obj3).getResourceTypeName(num.intValue()) + '/' + ((Resources) obj3).getResourceEntryName(num.intValue()));
                } catch (Resources.NotFoundException e13) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num, e13);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((c0) obj2).b(uri, i13, i14, lVar);
        }
    }

    public final String toString() {
        switch (this.f117390a) {
            case 0:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((List) this.f117391b).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public g0(Resources resources, c0 c0Var) {
        this.f117392c = resources;
        this.f117391b = c0Var;
    }
}
