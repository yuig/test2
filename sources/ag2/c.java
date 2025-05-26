package ag2;

import android.app.ApplicationExitInfo;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kh2.j;
import kotlin.text.Charsets;
import rl2.g0;
import xk2.m;
import xk2.v;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final v f15162a = m.b(a.f15154k);

    public static final String a(ApplicationExitInfo applicationExitInfo, ii2.d dVar) {
        InputStream traceInputStream;
        int reason;
        InputStream traceInputStream2;
        if (((ii2.a) dVar).a(31)) {
            reason = applicationExitInfo.getReason();
            if (reason == 5) {
                traceInputStream2 = applicationExitInfo.getTraceInputStream();
                if (traceInputStream2 != null) {
                    byte[] I1 = bs1.c.I1(traceInputStream2 instanceof BufferedInputStream ? (BufferedInputStream) traceInputStream2 : new BufferedInputStream(traceInputStream2, 8192));
                    if (I1 != null) {
                        return g0.l0(I1);
                    }
                }
                return null;
            }
        }
        traceInputStream = applicationExitInfo.getTraceInputStream();
        if (traceInputStream == null) {
            return null;
        }
        Reader inputStreamReader = new InputStreamReader(traceInputStream, Charsets.UTF_8);
        return j.z2(inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192));
    }
}
