package xl;

import com.google.firebase.encoders.EncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import vl.e;
import yl.i;

/* loaded from: classes3.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f135242a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f135242a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // vl.a
    public final void a(Object obj, Object obj2) {
        i iVar = (i) obj2;
        String format = f135242a.format((Date) obj);
        if (iVar.f139285a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        iVar.f139285a = true;
        iVar.f139288d.d(iVar.f139287c, format, iVar.f139286b);
    }
}
