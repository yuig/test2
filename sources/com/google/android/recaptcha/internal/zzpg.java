package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
final class zzpg {
    public static String zza(zzle zzleVar) {
        StringBuilder sb3 = new StringBuilder(zzleVar.zzd());
        for (int i13 = 0; i13 < zzleVar.zzd(); i13++) {
            byte zza = zzleVar.zza(i13);
            if (zza == 34) {
                sb3.append("\\\"");
            } else if (zza == 39) {
                sb3.append("\\'");
            } else if (zza != 92) {
                switch (zza) {
                    case 7:
                        sb3.append("\\a");
                        break;
                    case 8:
                        sb3.append("\\b");
                        break;
                    case 9:
                        sb3.append("\\t");
                        break;
                    case 10:
                        sb3.append("\\n");
                        break;
                    case 11:
                        sb3.append("\\v");
                        break;
                    case 12:
                        sb3.append("\\f");
                        break;
                    case 13:
                        sb3.append("\\r");
                        break;
                    default:
                        if (zza < 32 || zza > 126) {
                            sb3.append('\\');
                            sb3.append((char) (((zza >>> 6) & 3) + 48));
                            sb3.append((char) (((zza >>> 3) & 7) + 48));
                            sb3.append((char) ((zza & 7) + 48));
                            break;
                        } else {
                            sb3.append((char) zza);
                            break;
                        }
                        break;
                }
            } else {
                sb3.append("\\\\");
            }
        }
        return sb3.toString();
    }
}
