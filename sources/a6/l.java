package a6;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public interface l {
    Object getDefaultValue();

    Object readFrom(InputStream inputStream, bl2.c cVar);

    Object writeTo(Object obj, OutputStream outputStream, bl2.c cVar);
}
