package com.appscharles.libs.ioer.setters;

import com.appscharles.libs.ioer.models.RelativeFile;
import com.appscharles.libs.ioer.models.StatusProgress;

import java.math.BigDecimal;
import java.util.List;

/**
 * The type Status progress setter.
 */
public class StatusProgressSetter {

    public static void set(StatusProgress statusProgress, List<RelativeFile> relativeFiles, Integer relativeFileIndex) {
        if (statusProgress != null) {
            statusProgress.setStatus(relativeFiles.get(relativeFileIndex).getAbsolutePath());
            double progress = (relativeFileIndex +1.0) / relativeFiles.size();
            BigDecimal progressRounded = new BigDecimal(String.valueOf(progress)).setScale(2, BigDecimal.ROUND_HALF_UP);
            statusProgress.setProgress(progressRounded.doubleValue());
        }
    }
}