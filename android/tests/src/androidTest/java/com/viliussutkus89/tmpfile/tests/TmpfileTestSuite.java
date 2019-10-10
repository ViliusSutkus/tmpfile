package com.viliussutkus89.tmpfile.tests;

import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import java.io.File;

import static com.viliussutkus89.tmpfile.Tmpfile.s_subfolderInCache;

@RunWith(Suite.class)
@Suite.SuiteClasses({
  NoLeftoverTmpfilesBeforeTests.class,
  TmpfileInstrumentedTests.class,
  NoLeftoverTmpfilesAfterTests.class
})
public class TmpfileTestSuite {

  public static File getTmpfileDir() {
    File cacheDir = InstrumentationRegistry.getInstrumentation().getTargetContext().getCacheDir();
    return new File(cacheDir, s_subfolderInCache);
  }

  public static File[] getTmpfiles() {
    return getTmpfileDir().listFiles();
  }

}
