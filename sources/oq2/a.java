package oq2;

import androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticOutline0;
import java.io.ByteArrayOutputStream;
import org.spongycastle.util.encoders.DecoderException;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final g01.a f97244a = new g01.a();

    public static byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f97244a.a(byteArrayOutputStream, str);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e13) {
            DecoderException decoderException = new DecoderException(HiddenActivity$$ExternalSyntheticOutline0.m(e13, new StringBuilder("exception decoding Hex string: ")));
            decoderException.f97475a = e13;
            throw decoderException;
        }
    }
}
