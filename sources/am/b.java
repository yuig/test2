package am;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15507a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f15508b;

    public /* synthetic */ b(c cVar, int i13) {
        this.f15507a = i13;
        this.f15508b = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String byteArrayOutputStream;
        switch (this.f15507a) {
            case 0:
                c cVar = this.f15508b;
                synchronized (cVar) {
                    try {
                        h hVar = (h) cVar.f15509a.get();
                        ArrayList c13 = hVar.c();
                        hVar.b();
                        JSONArray jSONArray = new JSONArray();
                        for (int i13 = 0; i13 < c13.size(); i13++) {
                            a aVar = (a) c13.get(i13);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", aVar.f15505a);
                            jSONObject.put("dates", new JSONArray((Collection) aVar.f15506b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return byteArrayOutputStream;
            default:
                c cVar2 = this.f15508b;
                synchronized (cVar2) {
                    ((h) cVar2.f15509a.get()).i(System.currentTimeMillis(), ((km.b) cVar2.f15511c.get()).a());
                }
                return null;
        }
    }
}
