package yb2;

import com.pinterest.api.model.wy0;
import df.j1;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPOutputStream;
import kotlin.Unit;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import qz.d;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f138582a = {"US", "CA", "GB", "AU", "IE", "NZ", "FR", "DE", "ES", "PT", "NL", "IT", "CH", "BE", "SE", "NO", "FI", "DK", "AT", "CZ", "GR", "HU", "PL", "RO", "SK", "AR", "BR", "CL", "CO", "CY", "HK", "IL", "JP", "KR", "LU", "MT", "MX", "SG"};

    public static byte[] a(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        Writer outputStreamWriter = new OutputStreamWriter(gZIPOutputStream, UTF_8);
        BufferedWriter bufferedWriter = outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
        try {
            bufferedWriter.write(data);
            bufferedWriter.close();
            Unit unit = Unit.f80348a;
            dl2.b.J(bufferedWriter, null);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } finally {
        }
    }

    public static final boolean b(wy0 wy0Var) {
        if (wy0Var != null) {
            Boolean G3 = wy0Var.G3();
            Intrinsics.checkNotNullExpressionValue(G3, "getIsPartner(...)");
            if (G3.booleanValue() && c0.y(f138582a, wy0Var.G2())) {
                return true;
            }
        }
        return false;
    }

    public static d c(String errorData) {
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        try {
            return errorData.length() == 0 ? new d() : z.p(errorData, "{", false) ? new d(new vd0.c(errorData)) : z.p(errorData, "[", false) ? new d(new vd0.c(j1.V("{\"data\":\"%s\"}", new vd0.a(errorData)))) : new d(new vd0.c(j1.V("{\"data\":\"%s\"}", errorData)));
        } catch (Exception unused) {
            return new d();
        }
    }
}
