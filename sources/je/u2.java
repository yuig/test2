package je;

import android.content.Context;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.util.Log;
import com.caverock.androidsvg.SVGImageView;
import com.caverock.androidsvg.SVGParseException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class u2 extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final Context f75794a;

    /* renamed from: b, reason: collision with root package name */
    public final int f75795b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SVGImageView f75796c;

    public u2(SVGImageView sVGImageView, Context context, int i13) {
        this.f75796c = sVGImageView;
        this.f75794a = context;
        this.f75795b = i13;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        int i13 = this.f75795b;
        try {
            Resources resources = this.f75794a.getResources();
            f3 f3Var = new f3();
            InputStream openRawResource = resources.openRawResource(i13);
            try {
                j2 f13 = f3Var.f(openRawResource);
                try {
                    return f13;
                } catch (IOException unused) {
                    return f13;
                }
            } finally {
                try {
                    openRawResource.close();
                } catch (IOException unused2) {
                }
            }
        } catch (SVGParseException e13) {
            Log.e("SVGImageView", String.format("Error loading resource 0x%x: %s", Integer.valueOf(i13), e13.getMessage()));
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        SVGImageView sVGImageView = this.f75796c;
        sVGImageView.f29842a = (j2) obj;
        sVGImageView.a();
    }
}
