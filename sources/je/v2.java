package je;

import android.os.AsyncTask;
import android.util.Log;
import com.caverock.androidsvg.SVGImageView;
import com.caverock.androidsvg.SVGParseException;
import com.pinterest.api.model.f30;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v2 extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75803a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f75804b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2(SVGImageView sVGImageView) {
        this(sVGImageView, 0);
        this.f75803a = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.InputStream[]] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        j2 j2Var = null;
        switch (this.f75803a) {
            case 0:
                Object[] objArr2 = (InputStream[]) objArr;
                try {
                    try {
                        j2Var = new f3().f(objArr2[0]);
                        objArr2 = objArr2[0];
                    } catch (SVGParseException e13) {
                        Log.e("SVGImageView", "Parse error loading URI: " + e13.getMessage());
                        objArr2 = objArr2[0];
                    }
                    objArr2.close();
                    return j2Var;
                } catch (Throwable th3) {
                    try {
                        objArr2[0].close();
                    } catch (IOException unused) {
                    }
                    throw th3;
                }
            default:
                f30[] params = (f30[]) objArr;
                Intrinsics.checkNotNullParameter(params, "params");
                y42.g gVar = (y42.g) this.f75804b;
                y42.b bVar = gVar.f137718a;
                if (bVar != null) {
                    gVar.f137721d.a(bVar, params[0]);
                }
                gVar.b();
                return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        switch (this.f75803a) {
            case 0:
                SVGImageView sVGImageView = (SVGImageView) this.f75804b;
                sVGImageView.f29842a = (j2) obj;
                sVGImageView.a();
                break;
            default:
                super.onPostExecute(obj);
                break;
        }
    }

    public /* synthetic */ v2(Object obj, int i13) {
        this.f75803a = i13;
        this.f75804b = obj;
    }
}
