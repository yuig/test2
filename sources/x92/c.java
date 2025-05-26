package x92;

import com.pinterest.api.model.eh0;
import com.pinterest.typeaheadroom.AppDatabase;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes2.dex */
public final class c implements eh0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c f134368a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static AppDatabase f134369b;

    public final void a(BufferedReader reader) {
        List split$default;
        Intrinsics.checkNotNullParameter(reader, "reader");
        if (f134369b != null) {
            ArrayList arrayList = new ArrayList();
            while (true) {
                String readLine = reader.readLine();
                if (readLine == null) {
                    break;
                }
                split$default = StringsKt__StringsKt.split$default(readLine, new String[]{"\t"}, false, 0, 6, null);
                if (split$default.size() >= 2) {
                    arrayList.add(new d((String) split$default.get(0), Float.parseFloat((String) split$default.get(1))));
                }
            }
            AppDatabase appDatabase = f134369b;
            if (appDatabase == null) {
                Intrinsics.r("db");
                throw null;
            }
            b t13 = appDatabase.t();
            d[] dVarArr = (d[]) arrayList.toArray(new d[0]);
            t13.H((d[]) Arrays.copyOf(dVarArr, dVarArr.length));
        }
    }
}
