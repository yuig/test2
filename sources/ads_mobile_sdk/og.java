package ads_mobile_sdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class og {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9248a;

    /* renamed from: b, reason: collision with root package name */
    public final a.se f9249b;

    public og(Context context, a.se seVar) {
        this.f9248a = context;
        this.f9249b = seVar;
    }

    public final void a(String str, byte[] bArr) {
        if (this.f9249b == null) {
            return;
        }
        StringBuilder sb3 = new StringBuilder("os.arch:");
        sb3.append(ok.f0.OS_ARCH.value());
        sb3.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb3.append("supported_abis:");
                sb3.append(Arrays.toString(strArr));
                sb3.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb3.append("CPU_ABI:");
        sb3.append(Build.CPU_ABI);
        sb3.append(";CPU_ABI2:");
        sb3.append(Build.CPU_ABI2);
        sb3.append(";");
        if (bArr != null) {
            sb3.append("ELF:");
            sb3.append(Arrays.toString(bArr));
            sb3.append(";");
        }
        if (str != null) {
            sb3.append("dbg:");
            sb3.append(str);
            sb3.append(";");
        }
        a.se seVar = this.f9249b;
        ((x71) ((x3) seVar).f13404a).a(4007, -1L, null, sb3.toString());
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(Boolean.TRUE);
        taskCompletionSource.getTask();
    }

    public final ng a() {
        ng ngVar;
        FileInputStream fileInputStream;
        byte[] bArr;
        File file = new File(new File(this.f9248a.getApplicationInfo().dataDir), "lib");
        if (!file.exists()) {
            a.se seVar = this.f9249b;
            if (seVar != null) {
                ((x71) ((x3) seVar).f13404a).a(5017, -1L, null, "No lib/");
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                taskCompletionSource.setResult(Boolean.TRUE);
                taskCompletionSource.getTask();
            }
            ngVar = ng.UNKNOWN;
        } else {
            File[] listFiles = file.listFiles(new sd.e(Pattern.compile(".*\\.so$", 2)));
            if (listFiles != null && listFiles.length != 0) {
                try {
                    fileInputStream = new FileInputStream(listFiles[0]);
                    try {
                        bArr = new byte[20];
                    } finally {
                    }
                } catch (IOException e13) {
                    a(e13.toString(), null);
                }
                if (fileInputStream.read(bArr) == 20) {
                    byte[] bArr2 = {0, 0};
                    if (bArr[5] == 2) {
                        a(null, bArr);
                        ngVar = ng.UNSUPPORTED;
                        fileInputStream.close();
                    } else {
                        bArr2[0] = bArr[19];
                        bArr2[1] = bArr[18];
                        short s13 = ByteBuffer.wrap(bArr2).getShort();
                        if (s13 == 3) {
                            ngVar = ng.X86;
                        } else if (s13 == 40) {
                            ngVar = ng.ARM7;
                        } else if (s13 == 62) {
                            ngVar = ng.X86_64;
                        } else if (s13 == 183) {
                            ngVar = ng.ARM64;
                        } else if (s13 != 243) {
                            a(null, bArr);
                            ngVar = ng.UNSUPPORTED;
                        } else {
                            ngVar = ng.RISCV64;
                        }
                        fileInputStream.close();
                    }
                } else {
                    fileInputStream.close();
                    ngVar = ng.UNSUPPORTED;
                }
            } else {
                a.se seVar2 = this.f9249b;
                if (seVar2 != null) {
                    ((x71) ((x3) seVar2).f13404a).a(5017, -1L, null, "No .so");
                    TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                    taskCompletionSource2.setResult(Boolean.TRUE);
                    taskCompletionSource2.getTask();
                }
                ngVar = ng.UNKNOWN;
            }
        }
        if (ngVar == ng.UNKNOWN) {
            HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
            String value = ok.f0.OS_ARCH.value();
            if (TextUtils.isEmpty(value) || !hashSet.contains(value)) {
                try {
                    String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                    if (strArr != null && strArr.length > 0) {
                        value = strArr[0];
                    }
                } catch (IllegalAccessException e14) {
                    a.se seVar3 = this.f9249b;
                    if (seVar3 != null) {
                        seVar3.a(2024, 0L, e14);
                    }
                } catch (NoSuchFieldException e15) {
                    a.se seVar4 = this.f9249b;
                    if (seVar4 != null) {
                        seVar4.a(2024, 0L, e15);
                    }
                }
                value = Build.CPU_ABI;
                if (value == null) {
                    value = Build.CPU_ABI2;
                }
            }
            if (TextUtils.isEmpty(value)) {
                a("Empty dev arch", null);
                ngVar = ng.UNSUPPORTED;
            } else if (!value.equalsIgnoreCase("i686") && !value.equalsIgnoreCase("x86")) {
                if (value.equalsIgnoreCase("x86_64")) {
                    ngVar = ng.X86_64;
                } else if (value.equalsIgnoreCase("arm64-v8a")) {
                    ngVar = ng.ARM64;
                } else if (!value.equalsIgnoreCase("armeabi-v7a") && !value.equalsIgnoreCase("armv71")) {
                    if (value.equalsIgnoreCase("riscv64")) {
                        ngVar = ng.RISCV64;
                    } else {
                        a(value, null);
                        ngVar = ng.UNSUPPORTED;
                    }
                } else {
                    ngVar = ng.ARM7;
                }
            } else {
                ngVar = ng.X86;
            }
        }
        a.se seVar5 = this.f9249b;
        if (seVar5 != null) {
            ((x71) ((x3) seVar5).f13404a).a(5018, -1L, null, ngVar.name());
            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
            taskCompletionSource3.setResult(Boolean.TRUE);
            taskCompletionSource3.getTask();
        }
        return ngVar;
    }
}
