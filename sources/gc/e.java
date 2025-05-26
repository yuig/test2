package gc;

import android.content.Context;
import com.airbnb.lottie.n;
import com.airbnb.lottie.z;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final c f64766a;

    /* renamed from: b, reason: collision with root package name */
    public final eb.d f64767b;

    public e(c cVar, eb.d dVar) {
        this.f64766a = cVar;
        this.f64767b = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [com.airbnb.lottie.z] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00bd -> B:31:0x00e7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00e6 -> B:31:0x00e7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.airbnb.lottie.z a(android.content.Context r12, java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gc.e.a(android.content.Context, java.lang.String, java.lang.String):com.airbnb.lottie.z");
    }

    public final z b(Context context, String str, InputStream inputStream, String str2, String str3) {
        z h10;
        b bVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        boolean contains = str2.contains("application/zip");
        c cVar = this.f64766a;
        if (contains || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            jc.b.a();
            b bVar2 = b.ZIP;
            h10 = (str3 == null || cVar == null) ? n.h(context, new ZipInputStream(inputStream), null) : n.h(context, new ZipInputStream(new FileInputStream(cVar.Q(str, inputStream, bVar2))), str);
            bVar = bVar2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            jc.b.a();
            bVar = b.GZIP;
            h10 = (str3 == null || cVar == null) ? n.c(new GZIPInputStream(inputStream), null) : n.c(new GZIPInputStream(new FileInputStream(cVar.Q(str, inputStream, bVar))), str);
        } else {
            jc.b.a();
            bVar = b.JSON;
            h10 = (str3 == null || cVar == null) ? n.c(inputStream, null) : n.c(new FileInputStream(cVar.Q(str, inputStream, bVar).getAbsolutePath()), str);
        }
        if (str3 != null && h10.f28505a != null && cVar != null) {
            File file = new File(cVar.L(), c.H(str, bVar, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean renameTo = file.renameTo(file2);
            file2.toString();
            jc.b.a();
            if (!renameTo) {
                jc.b.c("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return h10;
    }
}
