package r02;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Base64;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f105781i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s0 f105782j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(s0 s0Var, int i13) {
        super(1);
        this.f105781i = i13;
        this.f105782j = s0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ContentResolver contentResolver;
        Cursor query;
        int i13 = this.f105781i;
        s0 s0Var = this.f105782j;
        switch (i13) {
            case 0:
                Intent intent = (Intent) obj;
                Unit unit = null;
                if (intent != null) {
                    Uri uri = intent.getData();
                    if (uri != null) {
                        kotlin.jvm.internal.i0 i0Var = new kotlin.jvm.internal.i0();
                        Context context = s0Var.getContext();
                        gw1.i onFinish = new gw1.i(15, s0Var, i0Var);
                        Intrinsics.checkNotNullParameter(uri, "uri");
                        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
                        if (context != null && (contentResolver = context.getContentResolver()) != null && (query = contentResolver.query(uri, null, null, null, null)) != null) {
                            int columnIndex = query.getColumnIndex("_display_name");
                            int columnIndex2 = query.getColumnIndex("_size");
                            query.moveToFirst();
                            String string = query.getString(columnIndex);
                            long j13 = query.getLong(columnIndex2);
                            String str = string.toString();
                            File filesDir = context.getFilesDir();
                            String path = filesDir != null ? filesDir.getPath() : null;
                            File attachment = new File(path + File.separatorChar + str);
                            try {
                                ContentResolver contentResolver2 = context.getContentResolver();
                                InputStream openInputStream = contentResolver2 != null ? contentResolver2.openInputStream(uri) : null;
                                if (openInputStream != null) {
                                    try {
                                        try {
                                            FileOutputStream fileOutputStream = new FileOutputStream(attachment);
                                            try {
                                                byte[] bArr = new byte[4096];
                                                while (true) {
                                                    int read = openInputStream.read(bArr);
                                                    if (read > 0) {
                                                        fileOutputStream.write(bArr, 0, read);
                                                    } else {
                                                        fileOutputStream.flush();
                                                        Unit unit2 = Unit.f80348a;
                                                        dl2.b.J(fileOutputStream, null);
                                                    }
                                                }
                                            } finally {
                                            }
                                        } catch (Exception unused) {
                                        }
                                    } finally {
                                    }
                                }
                                Unit unit3 = Unit.f80348a;
                                dl2.b.J(openInputStream, null);
                            } catch (Exception unused2) {
                            }
                            Intrinsics.checkNotNullParameter(attachment, "attachment");
                            String encodeToString = Base64.getEncoder().encodeToString(il2.k.a(attachment));
                            Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
                            query.close();
                            onFinish.invoke(new l0(j13, string, "data:application/pdf;base64," + encodeToString));
                        }
                        s0Var.Y7(i0Var.f80432a < ((long) s0Var.f105803c0) ? m0.Success : m0.Error);
                        unit = Unit.f80348a;
                    }
                    if (unit == null) {
                        m0 m0Var = m0.Error;
                        int i14 = s0.f105802t0;
                        s0Var.Y7(m0Var);
                    }
                    unit = Unit.f80348a;
                }
                if (unit == null) {
                    m0 m0Var2 = m0.Error;
                    int i15 = s0.f105802t0;
                    s0Var.Y7(m0Var2);
                }
                return Unit.f80348a;
            default:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                String str2 = s0Var.f105806f0;
                if (str2 == null) {
                    str2 = "";
                }
                return rn1.a.y(it, bs1.c.h2(str2), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }
}
