package xl;

import com.google.firebase.encoders.EncodingException;
import java.nio.charset.Charset;
import java.util.Map;
import yl.g;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements vl.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135240a;

    @Override // vl.a
    public final void a(Object obj, Object obj2) {
        switch (this.f135240a) {
            case 0:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Charset charset = g.f139275f;
                g gVar = (g) ((vl.d) obj2);
                gVar.d(g.f139276g, entry.getKey(), true);
                gVar.d(g.f139277h, entry.getValue(), true);
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
