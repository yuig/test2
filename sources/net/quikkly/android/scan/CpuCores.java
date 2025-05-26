package net.quikkly.android.scan;

import android.util.Log;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.regex.Pattern;
import net.quikkly.android.Quikkly;

/* loaded from: classes4.dex */
public class CpuCores {

    public static class CpuFilter implements FileFilter {
        private CpuFilter() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return Pattern.matches("cpu[0-9]+", file.getName());
        }
    }

    public static int getNumCpuCores() {
        try {
            File file = new File("/sys/devices/system/cpu/");
            File[] listFiles = file.listFiles(new CpuFilter());
            if (listFiles == null) {
                throw new IOException("Cannot list files in path " + file);
            }
            int length = listFiles.length;
            if (length >= 1) {
                Log.i(Quikkly.TAG, "Detected " + length + " CPU cores.");
            } else {
                Log.w(Quikkly.TAG, "Failed to get CPU core count.");
            }
            return length;
        } catch (Exception e13) {
            Log.w(Quikkly.TAG, "Failed to get CPU core count.", e13);
            return 0;
        }
    }
}
