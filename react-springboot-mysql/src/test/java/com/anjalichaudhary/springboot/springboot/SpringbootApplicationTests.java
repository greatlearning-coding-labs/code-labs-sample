package com.anjalichaudhary.springboot.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.*;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class SpringbootApplicationTests {

	File file = new File("./src/main/java/com/anjalichaudhary/test.txt");

	@Test
	public void FileExist(){
		
			assertThat(file.exists()).isTrue();
	}

	File file2 = new File("./src/main/java/com/anjalichaudhary/test2.txt");

	@Test
	public void FileExist2(){
		
			assertThat(file2.exists()).isTrue();
	}

	// @Test
    // public void testFilePresence() {
    //     File file = new File("./src/main/java/com/anjalichaudhary/test.txt");
    //     assertThat(file.exists()).isTrue();
    // }

}
